fun main() {
    var WallService = Post(0,0,0,0,"",
        0,0,false,Comments(),Copyright(),
        Likes(),Reposts(),Views(),"post",0,emptyArray<Post>(),
        false,false,false,0,false,false,Donut(),0);
}

public data class Post(
    var owner_id: Int,
    var from_id: Int,
    var created_by: Int,
    var date: Int,
    var text: String,
    var reply_owner_id: Int,
    var reply_post_id: Int,
    var friends_only: Boolean,
    var comments: Comments ,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var post_type: String,
    var signer_id: Int,
    var copy_history: Array<Post>,
    var can_pin: Boolean,
    var can_delete: Boolean,
    var can_edit: Boolean,
    var is_pinned: Int,
    var marked_as_ads: Boolean,
    var is_favorite: Boolean,
    var donut: Donut,
    var postponed_id: Int){
}

public data class Comments(
    var count: Int = 0,
    var can_post: Boolean = true,
    var groups_can_post: Boolean = true,
    var can_close: Boolean = true,
    var can_open: Boolean = true){
}

public data class Copyright(
    var link: String = "",
    var name: String = "",
    var type: String = ""){
}

public data class Likes(
    var count: Int = 0,
    var user_likes: Boolean = true,
    var can_like: Boolean = true,
    var can_publish: Boolean = true){
}

public data class Reposts(
    var count: Int = 0,
    var user_reposted: Boolean = false){
}

public data class Views(
    var count: Int = 0){
}

public data class Donut(
    var is_donut: Boolean = true,
    var paid_duration: Int = 0,
    var placeholder: Placeholder = Placeholder(),
    var can_publish_free_copy: Boolean = true,
    var edit_mode: String = ""){
}

public final class Placeholder(){

}