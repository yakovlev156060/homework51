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
            if (value.id == post.id) {
                posts[index] =
                    post.copy(ownerId = posts[index].ownerId, createdBy = posts[index].createdBy)
                return true
            }
        }
        return false
    }
}

public data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments ,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: Int,
    val copyHistory: Array<Post>,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int
    ){
    private var nextId:Int=0
}

public data class Comments(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true){
}

public data class Copyright(
    val link: String = "",
    val name: String = "",
    val type: String = ""){
}

public data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true){
}

public data class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = false){
}

public data class Views(
    val count: Int = 0){
}

public data class Donut(
    val isDonut: Boolean = true,
    val paidDuration: Int = 0,
    val placeholder: Placeholder = Placeholder(),
    val canPublishFreeCopy: Boolean = true,
    val editMode: String = ""){
}

public final class Placeholder(){

}