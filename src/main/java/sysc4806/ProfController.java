package sysc4806;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/prof")
public class ProfController {

    @Autowired
    private ProfRepo profRepo;

    @GetMapping(path="/add")
    public @ResponseBody String addNewStudent (@RequestParam String name, @RequestParam String email, @RequestParam String program) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Prof s = new Prof();
        s.setName(name);
        profRepo.save(s);
        return "Saved Student";
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Prof> getAllStudents() {
        // This returns a JSON or XML with the users
        return profRepo.findAll();
    }

    @GetMapping(path="/test")
    public @ResponseBody String returnHello() {
        // This returns a JSON or XML with the users
        return "Welcome to the Prof Page";
    }
}