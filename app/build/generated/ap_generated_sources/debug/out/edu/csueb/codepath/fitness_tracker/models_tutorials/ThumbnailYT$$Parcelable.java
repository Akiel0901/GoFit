
package edu.csueb.codepath.fitness_tracker.models_tutorials;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class ThumbnailYT$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT thumbnailYT$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<ThumbnailYT$$Parcelable>CREATOR = new Creator<ThumbnailYT$$Parcelable>() {


        @Override
        public ThumbnailYT$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new ThumbnailYT$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public ThumbnailYT$$Parcelable[] newArray(int size) {
            return new ThumbnailYT$$Parcelable[size] ;
        }

    }
    ;

    public ThumbnailYT$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT thumbnailYT$$2) {
        thumbnailYT$$0 = thumbnailYT$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(thumbnailYT$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT thumbnailYT$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(thumbnailYT$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(thumbnailYT$$1));
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT$MediumThumbnail$$Parcelable.write(thumbnailYT$$1 .medium, parcel$$1, flags$$0, identityMap$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT getParcel() {
        return thumbnailYT$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT thumbnailYT$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            thumbnailYT$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT();
            identityMap$$1 .put(reservation$$0, thumbnailYT$$4);
            MediumThumbnail mediumThumbnail$$0 = edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT$MediumThumbnail$$Parcelable.read(parcel$$3, identityMap$$1);
            thumbnailYT$$4 .medium = mediumThumbnail$$0;
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT thumbnailYT$$3 = thumbnailYT$$4;
            identityMap$$1 .put(identity$$1, thumbnailYT$$3);
            return thumbnailYT$$3;
        }
    }

}
