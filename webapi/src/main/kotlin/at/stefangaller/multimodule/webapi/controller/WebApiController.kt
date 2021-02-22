package at.stefangaller.multimodule.webapi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/webapi/v1/")
class WebApiController {

    @GetMapping("/simple")
    fun someWebEndpoint(): ResponseEntity<Any> {
        return ResponseEntity.ok("WebApi Works!")
    }

}
