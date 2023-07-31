
package edu.csueb.codepath.fitness_tracker.models_tutorials;

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
public class VideoID$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID videoID$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<VideoID$$Parcelable>CREATOR = new Creator<VideoID$$Parcelable>() {


        @Override
        public VideoID$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new VideoID$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public VideoID$$Parcelable[] newArray(int size) {
            return new VideoID$$Parcelable[size] ;
        }

    }
    ;

    public VideoID$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID videoID$$2) {
        videoID$$0 = videoID$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(videoID$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID videoID$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(videoID$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(videoID$$1));
            parcel$$1 .writeString(videoID$$1 .videoId);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID getParcel() {
        return videoID$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID videoID$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            videoID$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID();
            identityMap$$1 .put(reservation$$0, videoID$$4);
            videoID$$4 .videoId = parcel$$3 .readString();
            edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID videoID$$3 = videoID$$4;
            identityMap$$1 .put(identity$$1, videoID$$3);
            return videoID$$3;
        }
    }

}
