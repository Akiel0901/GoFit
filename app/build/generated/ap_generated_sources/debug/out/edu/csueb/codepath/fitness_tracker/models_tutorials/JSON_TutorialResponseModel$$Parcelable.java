
package edu.csueb.codepath.fitness_tracker.models_tutorials;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class JSON_TutorialResponseModel$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel jSON_TutorialResponseModel$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<JSON_TutorialResponseModel$$Parcelable>CREATOR = new Creator<JSON_TutorialResponseModel$$Parcelable>() {


        @Override
        public JSON_TutorialResponseModel$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new JSON_TutorialResponseModel$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public JSON_TutorialResponseModel$$Parcelable[] newArray(int size) {
            return new JSON_TutorialResponseModel$$Parcelable[size] ;
        }

    }
    ;

    public JSON_TutorialResponseModel$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel jSON_TutorialResponseModel$$2) {
        jSON_TutorialResponseModel$$0 = jSON_TutorialResponseModel$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(jSON_TutorialResponseModel$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel jSON_TutorialResponseModel$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(jSON_TutorialResponseModel$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(jSON_TutorialResponseModel$$1));
            parcel$$1 .writeString(jSON_TutorialResponseModel$$1 .nextPageToken);
            if (jSON_TutorialResponseModel$$1 .items == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(jSON_TutorialResponseModel$$1 .items.size());
                for (edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$0 : jSON_TutorialResponseModel$$1 .items) {
                    edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT$$Parcelable.write(videoYT$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel getParcel() {
        return jSON_TutorialResponseModel$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel jSON_TutorialResponseModel$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            jSON_TutorialResponseModel$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel();
            identityMap$$1 .put(reservation$$0, jSON_TutorialResponseModel$$4);
            jSON_TutorialResponseModel$$4 .nextPageToken = parcel$$3 .readString();
            int int$$0 = parcel$$3 .readInt();
            ArrayList<edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$1 = edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(videoYT$$1);
                }
            }
            jSON_TutorialResponseModel$$4 .items = list$$0;
            edu.csueb.codepath.fitness_tracker.models_tutorials.JSON_TutorialResponseModel jSON_TutorialResponseModel$$3 = jSON_TutorialResponseModel$$4;
            identityMap$$1 .put(identity$$1, jSON_TutorialResponseModel$$3);
            return jSON_TutorialResponseModel$$3;
        }
    }

}
