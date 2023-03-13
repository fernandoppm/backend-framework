package person

class Login(
    val uuid: String,
    val username: String,
    val password: String,
    val salt: String,
    val mds: String,
    val sha1: String,
    val sha256: String,
)
{
}