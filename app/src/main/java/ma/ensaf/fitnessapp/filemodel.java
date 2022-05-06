package ma.ensaf.fitnessapp;

public class filemodel {

        String title,vurl,description;

        public filemodel() {
        }

        public filemodel(String title, String vurl) {
            this.title = title;
            this.vurl = vurl;
        }

    public filemodel(String title, String vurl, String description) {
        this.title = title;
        this.vurl = vurl;
        this.description = description;
    }

    public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVurl() {
            return vurl;
        }

        public void setVurl(String vurl) {
            this.vurl = vurl;
        }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
