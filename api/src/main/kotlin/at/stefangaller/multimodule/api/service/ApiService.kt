package at.stefangaller.multimodule.api.service

import at.stefangaller.multimodule.api.models.ApiModel
import org.springframework.stereotype.Service

@Service
class ApiService {
   fun findApiModel(): ApiModel = ApiModel(1, "my first model")
}
