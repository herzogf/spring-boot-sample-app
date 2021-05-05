package herzogf.sample.samplewebapp.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api")
@Tag(name = "Hello World Resource")
public class HelloWorldResource {
    
    /**
     * Create some nice greeting text.
     * 
     * @return String with nice greeting
     */
    @Operation(description = "Returns some nice greeting text")
    @GetMapping(path = "/greeting")
    public ResponseEntity<String> getGreeting(){
        return ResponseEntity.ok("Hello World!");
    }

}
