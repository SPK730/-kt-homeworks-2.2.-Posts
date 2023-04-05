package ru.netology

import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {
    @Test
    fun add() {
        val service = WallService
        //service.add(Post(1, Likes(0)))
        val result = service.add(
            Post(1, Likes(0), 1547, 198460000, "какой-то текст", "(c)", "copy", true, false, false)
        )
        assertTrue(result.id > 0)
    }


//    fun updateExisting() {// создаём целевой сервис
//        val service = WallService()  // заполняем несколькими постами
//        service.add(Post(/* заполняете поля */))
//        service.add(Post(/* заполняете поля */))
//        service.add(Post(/* заполняете поля */))
//        // создаём информацию об обновлении
//        val update = Post(/* заполняете поля */)
//
//        // выполняем целевое действие
//        val result = service.update(update)
//
//        // проверяем результат (используйте assertTrue или assertFalse)
//        assertTrue(result)
//    }
}