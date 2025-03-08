package enum_practice;

public enum URLs {

    facebook("https://www.facebook.com"),
    google("https://www.google.com");

    String url;

    URLs(String url){
      this.url=url;
    }

    void getUrl(){
        System.out.println(this.url);
    }
}
