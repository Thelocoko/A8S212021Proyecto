package mx.edu.tesoem.isc.ecr.a8s212021proyecto.ui.informacionusuario;

import android.graphics.drawable.Drawable;

import androidx.lifecycle.ViewModel;

public class MostrarInformacionViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    Drawable image;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}