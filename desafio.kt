enum class Level { BASIC, INTERMEDIATE, ADVANCED }

class User

data class EducationalContent(var name: String, val duration: Int = 60)

data class TrainingProgram(val name: String, var contents: List<EducationalContent>) {

    val enrolledUsers = mutableListOf<User>()

    fun enroll(user: User) {
        enrolledUsers.add(user)
    }
}

fun main() {
    val user1 = User()
    val user2 = User()

    val content1 = EducationalContent("Introduction to Programming", 90)
    val content2 = EducationalContent("Data Structures", 120)
    val content3 = EducationalContent("Advanced Algorithms", 150)

    val program = TrainingProgram("Kotlin Training Program", listOf(content1, content2, content3))

    program.enroll(user1)
    program.enroll(user2)

    println("Users enrolled in the training program: ${program.enrolledUsers}")
}
