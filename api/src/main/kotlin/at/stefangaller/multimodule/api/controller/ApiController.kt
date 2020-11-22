package at.stefangaller.multimodule.api.controller

import at.stefangaller.multimodule.api.models.SimpleApiModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class ApiController {

    @GetMapping("/simple")
    fun simpleApiEndpoint(): ResponseEntity<SimpleApiModel> {
        return ResponseEntity.ok(
                SimpleApiModel(1, "my first model")
        )
    }

}
