package com.iniongun.tivbible.reader.search.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iniongun.tivbible.entities.Chapter
import com.iniongun.tivbible.reader.databinding.SingleChapterLayoutBinding
import com.iniongun.tivbible.reader.search.SearchViewModel

/**
 * Created by Isaac Iniongun on 26/04/2020.
 * For Tiv Bible project.
 */

/**
 * Adapter for the task list. Has a reference to the [SearchViewModel] to send actions back to it.
 */
class ChaptersAdapter(private val viewModel: SearchViewModel) :
    ListAdapter<Chapter, ChaptersAdapter.ViewHolder>(ChaptersDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chapter = getItem(position)
        holder.bind(viewModel, chapter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: SingleChapterLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(viewModel: SearchViewModel, chapter: Chapter) {
            binding.viewModel = viewModel
            binding.chapter = chapter
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = SingleChapterLayoutBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}

/**
 * Callback for calculating the diff between two non-null items in a list.
 *
 * Used by ListAdapter to calculate the minimum number of changes between and old list and a new
 * list that's been passed to `submitList`.
 */
class ChaptersDiffCallback : DiffUtil.ItemCallback<Chapter>() {
    override fun areItemsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return oldItem == newItem
    }
}