package offtop.UserSessionService.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class UserSession(@Id val id:String? = null, @Id val sessionId:String,
                        val first_received:String, val topic:String, val focus_score:String, val focus_value:String, val transcribed_at:String, val transcribed_speech:String)