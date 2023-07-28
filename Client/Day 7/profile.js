import React from 'react'
import {useSelector } from 'react-redux/es/hooks/useSelector'
import { logout, selectUser } from '../redux/userSlice'
import '../profile/profile.css'
import { useDispatch } from 'react-redux'
import { useNavigate } from 'react-router-dom'
import logo from "../profile/logo.png"

export default function Profile() {
  const user=useSelector(selectUser)
  const dispatch=useDispatch();
  const navigate=useNavigate();

  const handleLogout=()=>
  {
    dispatch(logout());
 
    navigate("/HOME");
  }
  if(!user)
  {
    navigate('/')
    return null;
  }
  return (
    <>
  <div class="profile-card">
    <div className="mh">
    <img style={{marginLeft:55}} src={logo}/>
    </div><br></br>
    <h1>{user.username}</h1><br></br>
    <ul>
      <li><strong>Email : </strong>{user.email}</li>
    </ul><br></br>
    <button onClick={handleLogout}>Logout</button>
   
  </div>

    </>
  )
}