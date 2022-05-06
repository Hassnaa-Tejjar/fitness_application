package ma.ensaf.fitnessapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class dashboard extends Fragment {

    FloatingActionButton addvideo;
    RecyclerView recview;
    DatabaseReference likereference;
    Boolean testclick=false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recview=(RecyclerView)view.findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<filemodel> options =
                new FirebaseRecyclerOptions.Builder<filemodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("myvideos"), filemodel.class)
                        .build();



        FirebaseRecyclerAdapter<filemodel,myviewholder> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<filemodel, myviewholder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull filemodel model) {
                holder.prepareexoplayer(getActivity().getApplication(), model.getTitle(),model.getVurl());

             /* FirebaseUser firebaseUser= FirebaseAuth.getInstance().getCurrentUser();
                final String userid=firebaseUser.getUid();
                final String postkey=getRef(position).getKey();

                holder.getlikebuttonstatus(postkey,userid);

                holder.like_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        testclick=true;

                        likereference.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if(testclick==true)
                                {
                                    if(snapshot.child(postkey).hasChild(userid))
                                    {
                                        likereference.child(postkey).child(userid).removeValue();
                                        testclick=false;
                                    }
                                    else
                                    {
                                        likereference.child(postkey).child(userid).setValue(true);
                                        testclick=false;
                                    }

                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });


                    }
                });*/

            }

            @NonNull
            @Override
            public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singelrow,parent,false);
                return new myviewholder(view);
            }
        };

        firebaseRecyclerAdapter.startListening();
        recview.setAdapter(firebaseRecyclerAdapter);
        return view;
    }
}