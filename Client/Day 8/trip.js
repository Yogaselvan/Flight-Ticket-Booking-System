import React, { useState } from 'react'
import "../Trip/trip.css";
import Tour from './data';
const Products=(tour)=> {

    return ( 
    <>
    <form className='vis'>
     <h4 className='rain_dot'>Trip Ideas</h4>
    
    
    <div className='rain_jack'>
      </div>
          <div className='img_ff'>
    <section class="shop_section sec_ptb_120" style={{marginLeft:-80}}>
    <div class="containerr">
{Tour.map((tour)=> (
      <div class="row justify-content-center">
        <div class="col-lg-4 col-md-6 col-sm-6">
          <div class="shop_card wow fadeInUp" data-wow-delay=".2s">
            <div class="share_btns">
            </div>
            <a class="item_imag" href="shop_details.html">
              <img src={tour.url} alt="image_not_found" width={286} />
            </a>
            <div class="item_content">
              <h3 class="item_title text-uppercase">
                <a href="shop_details.html">{tour.title}</a>
              </h3>
              <div class="btns_group">
                <span class="item_price bg_default_brown">{tour.Prize}</span>
                <a class="btn btn_border border_black text-uppercase" href="/search">BOOK NOW</a>
              </div>
            </div>
          </div>
        </div>
        </div>
               ))}
               </div>
               </section>
               </div>
               </form>
        </>
     );
}

export default Products;