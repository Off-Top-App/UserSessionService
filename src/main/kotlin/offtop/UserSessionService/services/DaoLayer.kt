package offtop.UserSessionService.services

import offtop.UserSessionService.models.UserSession
import org.springframework.data.mongodb.repository.MongoRepository

interface UserSessionDAO:MongoRepository<UserSession,String> {
        fun findByUserId(id: String): List<UserSession>
        //fun findByNameRegex(name: String): List<UserSession>
    }
