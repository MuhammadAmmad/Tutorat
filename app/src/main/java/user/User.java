package user;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mamadou on 7/9/16.
 */
public class User implements Parcelable {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String codePostal;
    private String email;
    private String username;
    private String password;

    public User() {
        // default constructor for firebase.
    }
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        // We just need to write each field into the
        // parcel. When we read from parcel, they
        // will come back in the same order
        parcel.writeString(lastName);
        parcel.writeString(firstName);
        parcel.writeString(email);
        parcel.writeString(username);
        //parcel.writeInt(idUtilisateur);
    }

    private User(Parcel in) {
        lastName = in.readString();
        firstName = in.readString();
        email = in.readString();
        username = in.readString();
    }


    /**
     *
     * This field is needed for Android to be able to
     * create new objects, individually or as arrays.
     *
     * */
    public static final Creator<User> CREATOR
            = new Creator<User>() {
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };

}
