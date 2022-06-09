data class Note(
//идентификатор заметки
    val noteId: Int? = null,
//Заголовок заметки.
    val title: String,
//Текст заметки.
    val text: String,
//Идентификатор владельца заметки.
    val ownerId: Int,
    //Дата создания заметки в формате Unixtime.
    val dateComment: Int? = null,

//Уровень доступа к заметке.
//Возможные значения:
//0 — все пользователи,
//1 — только друзья,
//2 — друзья и друзья друзей,
//3 — только пользователь.
    val privacy: Int=0,
//доступность заметки
    var availableNote: Boolean = false,

//коллекция заметок
    val comments: MutableList<Comment> = mutableListOf(),

//возможность удаления
    val itIsDeleted: Boolean = false
//
)