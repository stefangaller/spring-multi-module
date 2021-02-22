package at.stefangaller.multimodule.api.controller

import at.stefangaller.multimodule.api.models.ApiModel
import at.stefangaller.multimodule.api.service.ApiService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class ApiController {

    @Autowired
    private lateinit var apiService: ApiService

    @GetMapping("/simple")
    fun simpleApiEndpoint(): ResponseEntity<ApiModel> {
        return ResponseEntity.ok(
            apiService.findApiModel()
        )
    }

}
