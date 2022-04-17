@RestController
class WebApplication {

    @RequestMapping("/")
    String ping() {
        "Ping Pong"
    }

}