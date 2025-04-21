package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceInterface;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceInterface userService;

    @Autowired
    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/list";
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("user", new User());
        return "users/add";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name,
                          @RequestParam String lastName,
                          @RequestParam Byte age) {
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/edit")
    public String showEdit(@RequestParam Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "users/edit";
    }

    @PostMapping("/edit")
    public String editUser(@RequestParam Long id,
                           @RequestParam String name,
                           @RequestParam String lastName,
                           @RequestParam Byte age) {
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }
}
