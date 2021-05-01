package BackyardMonsters.electric.monsterloo;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.websocket.WsHandler;

public class Server implements IServer{

    private Javalin javalin;
    private GameWsHandler wsHandler;
    public Server(int port){
        javalin =  Javalin.create(config -> {
            config.addStaticFiles("/public");
        });
        javalin.start(port);

        wsHandler = new GameWsHandler();
        javalin.ws("",wsHandler1 -> {
            wsHandler1.onConnect(wsHandler);
            wsHandler1.onClose(wsHandler);
            wsHandler1.onMessage(wsHandler);
        });
    }


    @Override
    public void isLoggedIn(Context ctx) {
        ctx.coo
    }

    @Override
    public void login(Context ctx) {

    }

    @Override
    public void register(Context ctx) {

    }


}
