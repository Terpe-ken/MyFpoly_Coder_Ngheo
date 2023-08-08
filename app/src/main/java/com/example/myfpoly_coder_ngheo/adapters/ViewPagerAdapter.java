//package com.example.myfpoly_coder_ngheo.adapters;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentStatePagerAdapter;
//
//import com.example.myfpoly_coder_ngheo.Fragment.LichhocFragment;
//import com.example.myfpoly_coder_ngheo.MainActivity;
//import com.example.myfpoly_coder_ngheo.dto.ListProductResponseDTO;
//import com.example.myfpoly_coder_ngheo.dto.ProductsResponseDTO;
//
//import java.util.ArrayList;
//
//
//public class ViewPagerAdapter extends FragmentStatePagerAdapter {
//
//        private MainActivity mActivity;
//
//        int anInt;
//    public ViewPagerAdapter(@NonNull FragmentManager fm, int anInt, MainActivity activity) {
//            super(fm);
//            this.anInt = anInt;
//            mActivity = activity;
//        }
//
//        @NonNull
//        @Override
//        public Fragment getItem(int position) {
////            if(position==0){
////                ArrayList<ProductsResponseDTO> listSchedule = mActivity.getDataSchedule();
////                LichhocFragment scheduleFragment = LichhocFragment.newInstance(listSchedule);
////                return scheduleFragment;
////            }
////
////            else{
////                ArrayList<ListProductResponseDTO.Schedule> listTestSchedule = mActivity.getDataTestSchedule();
////                TestScheduleFragment testScheduleFragment = TestScheduleFragment.newInstance(listTestSchedule);
////                return testScheduleFragment;
////            }
//        }
//
//        @Override
//        public int getCount() {
//            return anInt;
//        }
//}
