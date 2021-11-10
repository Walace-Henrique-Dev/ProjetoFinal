package service

import model.Course
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CourseServiceTest {
    val registro = Course("19","Mobile",8,null)
    val servicoCursos = CourseService()
    @Test
    fun registerCourse() {
        servicoCursos.registerCourse(registro)
        assertEquals(true,servicoCursos.registrado("19"))








    }
}