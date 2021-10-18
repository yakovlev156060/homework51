fun main() {
}
object WallService{
    private var nextId=0
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val newPost:Post=post.copy(nextId+1)
        posts+=newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (index == post.id) {
                posts[index] =
                    post.copy(id = index, owner_id = posts[index].owner_id, created_by = posts[index].created_by)
                return true
            }
        }
        return false
    }
}

public data class Post(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val comments: Comments ,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val post_type: String,
    val signer_id: Int,
    val copy_history: Array<Post>,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Int,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Donut,
    val postponed_id: Int
    ){
    private var nextId:Int=0
}

public data class Comments(
    val count: Int = 0,
    val can_post: Boolean = true,
    val groups_can_post: Boolean = true,
    val can_close: Boolean = true,
    val can_open: Boolean = true){
}

public data class Copyright(
    val link: String = "",
    val name: String = "",
    val type: String = ""){
}

public data class Likes(
    val count: Int = 0,
    val user_likes: Boolean = true,
    val can_like: Boolean = true,
    val can_publish: Boolean = true){
}

public data class Reposts(
    val count: Int = 0,
    val user_reposted: Boolean = false){
}

public data class Views(
    val count: Int = 0){
}

public data class Donut(
    val is_donut: Boolean = true,
    val paid_duration: Int = 0,
    val placeholder: Placeholder = Placeholder(),
    val can_publish_free_copy: Boolean = true,
    val edit_mode: String = ""){
}

public final class Placeholder(){

}