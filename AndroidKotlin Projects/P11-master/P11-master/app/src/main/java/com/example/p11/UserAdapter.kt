package com.example.p11


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.p11.databinding.FragmentListBinding
import com.example.p11.databinding.ItemLayout2Binding
import com.example.p11.databinding.ItemLayoutBinding

class UserAdapter(val onItemDelete: (Pair<User, Int>) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private val userList: MutableList<User> = mutableListOf()
    override fun getItemCount() = userList.size

    fun setUserList(list: List<User>) {
        val diffUtil = MyDiffUtil(userList, list)
        val diffResult = DiffUtil.calculateDiff(diffUtil)
        userList.clear()
        userList.addAll(list)
        diffResult.dispatchUpdatesTo(this)
    }

    companion object {
        private const val ONE = 1
        private const val TWO = 2
    }

    override fun getItemViewType(position: Int): Int {
        return when (userList[position].type) {
            1 -> ONE
            2 -> TWO
            else -> ONE
        }
    }

    inner class viewHolder1(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(user: User) {
            binding.userdata = user
            binding.image.load("https://cdn.pixabay.com/photo/2017/09/03/00/44/png-2709031_1280.png")
            binding.delete.setOnClickListener {

                onItemDelete(Pair(user, adapterPosition))
            }
        }
    }

    inner class viewHolder2(val binding: ItemLayout2Binding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(user: User) {
            binding.userdata = user
            binding.delete.setOnClickListener {

                onItemDelete(Pair(user, adapterPosition))
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ONE -> {
                val binding =
                    ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return viewHolder1(binding)
            }

            TWO -> {
                val binding =
                    ItemLayout2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return viewHolder2(binding)
            }

            else -> throw IllegalAccessException("invalid view type")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ONE -> (holder as viewHolder1).bindData(userList[position])
            TWO -> (holder as viewHolder2).bindData(userList[position])
        }
    }
}