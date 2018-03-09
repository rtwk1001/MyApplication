package incture.com.myapplication.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import incture.com.myapplication.R;
import incture.com.myapplication.model.TripResponse;
import incture.com.myapplication.ui.MainView;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private List<TripResponse.DataBean.DeliveryHeaderBean> deliveryHeaderBeans;
    private MainView mainView;

    public OrderAdapter(MainView view, List<TripResponse.DataBean.DeliveryHeaderBean> deliveryHeader) {
        this.deliveryHeaderBeans = deliveryHeader;
        mainView = view;
    }

    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_view, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OrderViewHolder holder, int position) {
        TripResponse.DataBean.DeliveryHeaderBean deliveryHeaderBean = deliveryHeaderBeans.get(position);
        holder.tvName.setText(deliveryHeaderBean.getSoldToAddress());
        if(deliveryHeaderBean.getDeliveryItems() != null) {
            holder.tvItems.setText(String.valueOf(deliveryHeaderBean.getDeliveryItems().size()));
        } else {
            holder.tvItems.setText("0");
        }
        holder.tvOrderID.setText(deliveryHeaderBean.getPurchaseOrder());
    }

    @Override
    public int getItemCount() {
        return deliveryHeaderBeans.size();
    }

    class OrderViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvItems;
        private TextView tvOrderID;

        OrderViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.txtName);
            tvOrderID = (TextView) itemView.findViewById(R.id.txtOrderID);
            tvItems = (TextView) itemView.findViewById(R.id.txtOrderItems);
        }
    }

}
