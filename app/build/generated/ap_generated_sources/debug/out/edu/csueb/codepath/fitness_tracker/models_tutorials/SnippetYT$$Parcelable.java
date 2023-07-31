
package edu.csueb.codepath.fitness_tracker.models_tutorials;

import java.util.Date;
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
public class SnippetYT$$Parcelable
    implements Parcelable, ParcelWrapper<edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT>
{

    private edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT snippetYT$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SnippetYT$$Parcelable>CREATOR = new Creator<SnippetYT$$Parcelable>() {


        @Override
        public SnippetYT$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SnippetYT$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SnippetYT$$Parcelable[] newArray(int size) {
            return new SnippetYT$$Parcelable[size] ;
        }

    }
    ;

    public SnippetYT$$Parcelable(edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT snippetYT$$2) {
        snippetYT$$0 = snippetYT$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(snippetYT$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT snippetYT$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(snippetYT$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(snippetYT$$1));
            parcel$$1 .writeSerializable(snippetYT$$1 .publishedAt);
            parcel$$1 .writeString(snippetYT$$1 .description);
            parcel$$1 .writeString(snippetYT$$1 .title);
            edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT$$Parcelable.write(snippetYT$$1 .thumbnails, parcel$$1, flags$$0, identityMap$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT getParcel() {
        return snippetYT$$0;
    }

    public static edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT snippetYT$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            snippetYT$$4 = new edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT();
            identityMap$$1 .put(reservation$$0, snippetYT$$4);
            snippetYT$$4 .publishedAt = ((Date) parcel$$3 .readSerializable());
            snippetYT$$4 .description = parcel$$3 .readString();
            snippetYT$$4 .title = parcel$$3 .readString();
            ThumbnailYT thumbnailYT$$0 = edu.csueb.codepath.fitness_tracker.models_tutorials.ThumbnailYT$$Parcelable.read(parcel$$3, identityMap$$1);
            snippetYT$$4 .thumbnails = thumbnailYT$$0;
            edu.csueb.codepath.fitness_tracker.models_tutorials.SnippetYT snippetYT$$3 = snippetYT$$4;
            identityMap$$1 .put(identity$$1, snippetYT$$3);
            return snippetYT$$3;
        }
    }

}
