package com.ziloe.ismailsportfolio;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {


    private Project [] projects;

    public ProjectAdapter(Project[] projects) {
        this.projects = projects;
    }


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        private ImageView projectImage;
        private TextView projectTitle;
        private TextView projectDescription;


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            projectImage = itemView.findViewById(R.id.image_view_project_icon);
            projectTitle = itemView.findViewById(R.id.text_view_project_name);
            projectDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        private void bind(Project project){
            projectImage.setImageResource(project.image);
            projectTitle.setText(project.name);
            projectDescription.setText(project.description);
        }
    }

}
