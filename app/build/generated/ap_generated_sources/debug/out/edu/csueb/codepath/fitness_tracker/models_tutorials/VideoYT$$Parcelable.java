
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
public class VideoYT$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<VideoYT$$Parcelable>CREATOR = new Creator<VideoYT$$Parcelable>() {


        @Override
        public VideoYT$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new VideoYT$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public VideoYT$$Parcelable[] newArray(int size) {
            return new VideoYT$$Parcelable[size] ;
        }

    }
    ;

    public VideoYT$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$2) {
        videoYT$$0 = videoYT$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(videoYT$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(videoYT$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(videoYT$$1));
            edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT$$Parcelable.write(videoYT$$1 .snippet, parcel$$1, flags$$0, identityMap$$0);
            edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID$$Parcelable.write(videoYT$$1 .id, parcel$$1, flags$$0, identityMap$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT getParcel() {
        return videoYT$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            videoYT$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT();
            identityMap$$1 .put(reservation$$0, videoYT$$4);
            SnippetYT snippetYT$$0 = edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT$$Parcelable.read(parcel$$3, identityMap$$1);
            videoYT$$4 .snippet = snippetYT$$0;
            VideoID videoID$$0 = edu.csueb.codepath.fitness_tracker.models_tutorials.VideoID$$Parcelable.read(parcel$$3, identityMap$$1);
            videoYT$$4 .id = videoID$$0;
            edu.csueb.codepath.fitness_tracker.models_tutorials.VideoYT videoYT$$3 = videoYT$$4;
            identityMap$$1 .put(identity$$1, videoYT$$3);
            return videoYT$$3;
        }
    }

}
