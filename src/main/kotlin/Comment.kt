data class Comment(
    //идентификатор комментария
    val commentId: Int,
    //Идентификатор автора комментария
    val userId: Int,
    //идентификатор заметки
    val noteId: Int,
    //Идентификатор владельца заметки.
    val ownerId: Int,
    //Дата создания комментария в формате Unixtime.
    val dateComment: Int? = null,
    //Текст комментария.
    val message: String? = null,
    //Идентификатор пользователя, ответом на комментарий которого является добавляемый комментарий (не передаётся, если комментарий не является ответом).
    val replyTo: Int? = null,
    //Уникальный идентификатор, предназначенный для предотвращения повторной отправки одинакового комментария.
    val guid: String? = null,
    //возможность удаления
    val itIsDeleted: Boolean = false,
    //доступность комментария.
    var availableСomment: Boolean = false,
)