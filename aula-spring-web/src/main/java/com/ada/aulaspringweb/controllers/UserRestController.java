package com.ada.aulaspringweb.controllers;

import com.ada.aulaspringweb.model.User;
import com.ada.aulaspringweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserRestController {

   @Autowired
   private UserService userService;
   @PostMapping("/save")
   public User save(@RequestBody User user){
       return userService.save(user);
   }
   @GetMapping("/all")
   public List<User> findAll(){
      return userService.findAll();
   }

   @GetMapping("email/{email}")
   public User findByEmail(@PathVariable String email){
      return userService.findByEmail(email);
   }

   @GetMapping("/{id}")
   public User findById(@PathVariable Long id){
      return userService.findById(id);
   }

   @DeleteMapping("/{id}")
   public void deleteById(@PathVariable Long id){
      userService.deleteById(id);
   }

   @PostMapping("/edit")
   public ResponseEntity<?> update(@RequestParam Long id, @RequestBody User user){

      if (user.getName() == null){
         System.out.println("O nome não pode ser nulo!");
         return ResponseEntity.badRequest().body("O nome não pode ser nulo!");
      }

      user.setId(id);

      try {
         userService.save(user);
      } catch (RuntimeException e){
         return ResponseEntity.internalServerError().body(e.getMessage());
      }

      return ResponseEntity.ok(user);

   }


}
