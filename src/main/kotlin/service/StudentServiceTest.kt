package service

import model.Student
import org.junit.jupiter.api.Assertions.*
import java.util.HashMap


internal class StudentServiceTest {
    val estudante = Student("11","Walace","W@G11.com", birthDate = null )
    val students: MutableMap<String?, Student> = HashMap()
    @org.junit.jupiter.api.Test

    fun subscribeStudent() {
    students[estudante.id] = estudante
        val cadastro = students[estudante.id]?.name
        assertEquals(estudante.name, cadastro)
    }
}