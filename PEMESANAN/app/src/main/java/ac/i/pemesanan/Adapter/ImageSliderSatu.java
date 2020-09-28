package ac.i.pemesanan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import ac.i.pemesanan.R;

public class ImageSliderSatu extends SliderViewAdapter<ImageSliderSatu.SliderAdapterVH> {
    private Context context;

    public ImageSliderSatu(Context context){
        this.context=context;
    }
    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,null);

        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        switch (position){
            case 0:
                Glide.with(viewHolder.itemView)
                        .load("https://awsimages.detik.net.id/community/media/visual/2017/10/09/c699ee52-da4d-49cb-bbd5-206c02badb64.jpg?a=1")
                        .into(viewHolder.imageViewBackground);
                break;

            case 1:
                Glide.with(viewHolder.itemView)
                        .load("https://majalahayah.com/wp-content/uploads/2020/01/mie-goreng-saus-tiram.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

            case 2:
                Glide.with(viewHolder.itemView)
                        .load("https://i2.wp.com/resepkoki.id/wp-content/uploads/2020/03/Resep-Mie-Setan.jpg?fit=1079%2C1214&ssl=1")
                        .into(viewHolder.imageViewBackground);
                break;

            case 3:
                Glide.with(viewHolder.itemView)
                        .load("https://gudeg.net/cni-content/uploads/modules/posts/20180503042939.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

            case 4:
                Glide.with(viewHolder.itemView)
                        .load("https://selerasa.com/wp-content/uploads/2015/11/images_Aneka_Sayur_sup-jagung-wortel.jpg")
                        .into(viewHolder.imageViewBackground);
                break;
            case 5:
                Glide.with(viewHolder.itemView)
                        .load("https://cherryberryweb.files.wordpress.com/2016/08/urap-1.jpg?w=816")
                        .into(viewHolder.imageViewBackground);
                break;
            case 6:
                Glide.with(viewHolder.itemView)
                        .load("https://www.pantau.com/uploads/news/image/2839-benarkah-makan-sayuran-rebus-bikin-tubuh-makin-sehat-1-1024-768.jpg")
                        .into(viewHolder.imageViewBackground);
                break;
            case 7:
                Glide.with(viewHolder.itemView)
                        .load("https://static.republika.co.id/uploads/images/inpicture_slide/memasak-dengan-sayuran-_180325095654-388.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

            case 8:
                Glide.with(viewHolder.itemView)
                        .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRfZe4SaFmW8aIFZVw_W2yNMgmFEH1C-tYwD70uhKK6NdwAC--F&usqp=CAU")
                        .into(viewHolder.imageViewBackground);
                break;

            default:
                Glide.with(viewHolder.itemView)
                        .load("https://asset-a.grid.id/crop/0x0:0x0/x/photo/2020/01/13/1533613903.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder{
        View itemView;
        ImageView imageViewBackground;
        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground=itemView.findViewById(R.id.iv_auto_image_slider);
            this.itemView=itemView;
        }
    }
}
