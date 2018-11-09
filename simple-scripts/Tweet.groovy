@groovy.transform.ToString()
class Tweet {

    Tweet(String user, String post) {
        this.user = user
        this.post = post
    }

    String user
    String post
    def comments = []
    Integer likes = 0
}



