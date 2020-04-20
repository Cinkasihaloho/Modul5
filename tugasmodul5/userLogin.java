public class userLogin {

    private String[][] data = new String[2][3];
    private String[][] historis = new String[2][4];
    private String email, password, roles = "";
    private String matkul1, matkul2, tanggal ="";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userLogin(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"cinkasihaloho@gmail.com", "12345", "superAdmin"},
            {"adzrafatikha@gmail.com", "12345", "user"} 
        };
        String[][] historis = 
        { 
            {"cinkasihaloho@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemograman","20-04-2020"},
            {"adzrafatikha@gmail.com", "Dasar Komputer dan Pemograman", "Konsep Jaringan Komputer","20-04-2020"} 
        };
        this.data = data;
        this.historis = historis;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    matkul1 = historis [i][1];
                    matkul2 = historis [i][2];
                    tanggal = historis [i][3];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("matkul1 : " + matkul1);
            System.out.println("matkul2 : " + matkul2);
            System.out.println("tanggal : " + tanggal);
            
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }

} 