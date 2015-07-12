package thoughtworks.academy.fragmentdemo;

import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FontAwesomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fontawesome-webfont.ttf");
        View rootView = inflater.inflate(R.layout.fragment_font_awesome, container, false);
        TextView text = (TextView) rootView.findViewById(R.id.text);
        text.setTypeface(font);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Font Awesome Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
