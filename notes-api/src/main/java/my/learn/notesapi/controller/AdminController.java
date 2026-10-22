package my.learn.notesapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/admin/notes")
public class AdminController {


    @GetMapping //fixme
    public ResponseEntity<?> getPublic() {
        return ResponseEntity.of(Optional.of("<h1>АДМИИИИН</h1>"));
    }

}
