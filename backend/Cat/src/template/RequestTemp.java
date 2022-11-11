package template;

public class RequestTemp {
  private String command;
  private int catId;

  
  public RequestTemp(String command, int catId) {
    this.command = command;
    this.catId = catId;
  }

  public RequestTemp(String command) {
    this.command = command;
  }

  public RequestTemp() {
  }


  public String getCommand() {
    return command;
  }
  public void setCommand(String command) {
    this.command = command;
  }
  public int getCatId() {
    return catId;
  }
  public void setCatId(int catId) {
    this.catId = catId;
  }
  
  @Override
  public String toString() {
    return "RequestTemp [command=" + command + ", catId=" + catId + "]";
  }
}
