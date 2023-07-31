
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
public class ThumbnailYT$MediumThumbnail$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail mediumThumbnail$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<ThumbnailYT$MediumThumbnail$$Parcelable>CREATOR = new Creator<ThumbnailYT$MediumThumbnail$$Parcelable>() {


        @Override
        public ThumbnailYT$MediumThumbnail$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new ThumbnailYT$MediumThumbnail$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public ThumbnailYT$MediumThumbnail$$Parcelable[] newArray(int size) {
            return new ThumbnailYT$MediumThumbnail$$Parcelable[size] ;
        }

    }
    ;

    public ThumbnailYT$MediumThumbnail$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail mediumThumbnail$$2) {
        mediumThumbnail$$0 = mediumThumbnail$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(mediumThumbnail$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail mediumThumbnail$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(mediumThumbnail$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(mediumThumbnail$$1));
            parcel$$1 .writeString(mediumThumbnail$$1 .url);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail getParcel() {
        return mediumThumbnail$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail mediumThumbnail$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            mediumThumbnail$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail();
            identityMap$$1 .put(reservation$$0, mediumThumbnail$$4);
            mediumThumbnail$$4 .url = parcel$$3 .readString();
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT.MediumThumbnail mediumThumbnail$$3 = mediumThumbnail$$4;
            identityMap$$1 .put(identity$$1, mediumThumbnail$$3);
            return mediumThumbnail$$3;
        }
    }

}
