package at.fhtechnikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@RestController
class MaintenanceMonitorController {

    private MaintenanceMonitor maintenancemonitor = new MaintenanceMonitor();

    @GetMapping("/api/monitor")
    public String getMessage() {
        return maintenancemonitor.getMessage();
    }

    @PutMapping("/updateMessage/{message}")
    public void updateMessage(@PathVariable String message) {
        maintenancemonitor.updateMessage(message);
    }

    @PutMapping("/add/{int1}/{int2}")
    public void add(@PathVariable int int1, @PathVariable int int2){
        maintenancemonitor.add(int1, int2);
    }

    @PutMapping("/adds/{integer}")
    public void adds(@PathVariable String integer){
        maintenancemonitor.adds(integer);
    }

    @GetMapping("/api/show")
    public int show(){
        return maintenancemonitor.getZahl();
    }

    public class MyRestController {
        @RequestMapping("/")
        public ModelAndView welcome() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("Index.html");
            return modelAndView;
        }
    }

}
