package BackyardMonsters.electric.monsterloo;

import io.javalin.http.Context;

public interface IServer {

    void isLoggedIn(Context ctx);
    void login(Context ctx);
    void register(Context ctx);


}
