package ac.i.pemesanan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import ac.i.pemesanan.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Pemesanan extends Fragment {
    EditText etnama, etemail, etperusahaan, etbudget, ettimeline, etNomorHp;
    Button OpenWhatsapp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pemesanan, container, false);

        etnama = view.findViewById(R.id.nama);
        etemail = view.findViewById(R.id.email);
        etperusahaan = view.findViewById(R.id.perusahaan);
        etbudget = view.findViewById(R.id.budget);
        ettimeline = view.findViewById(R.id.timeline);
        etNomorHp = view.findViewById(R.id.NomorHp);
        OpenWhatsapp = view.findViewById(R.id.btnOpenWhatsapp);

        OpenWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesan1 = etnama.getText().toString();
                String pesan2 = etemail.getText().toString();
                String pesan3 = etperusahaan.getText().toString();
                String pesan4 = etbudget.getText().toString();
                String pesan5 = ettimeline.getText().toString();
                String pesan6 = etNomorHp.getText().toString();

        String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" + "Perusahaan: " + pesan3 + "\n" + "Budget: " + pesan4 + "\n" + "Timeline: " + pesan5 + "\n" + "NomorHP: " + pesan6 + "\n" + "Budget: ";
                Intent kirimWA = new Intent();
                kirimWA.setAction(Intent.ACTION_SEND);
                kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                kirimWA.putExtra("ima", "6285641187175" + "@s.whatsapp.net");
                kirimWA.setType("text/plain");
                kirimWA.setPackage("com.whatsapp");
                startActivity(kirimWA);

            }
        });

        return view;
    }
};

