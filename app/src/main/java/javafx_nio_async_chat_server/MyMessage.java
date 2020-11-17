package javafx_nio_async_chat_server;

class MyMessage {
    public String type;
    public String data;
    public String[] dataArr;

    public MyMessage(String type, String data) {
        this.type = type;
        this.data = data;
    }

    public MyMessage(String type, String[] dataArr) {
        this.type = type;
        this.dataArr = dataArr;
    }
}