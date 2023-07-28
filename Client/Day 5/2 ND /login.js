import React, { useState } from 'react';
import '../2 ND /signup.css'
import { useNavigate,Link, } from 'react-router-dom';
import { useDispatch } from 'react-redux';
import { login } from '../../redux/userSlice';
import logo from '../2 ND /logo.mp4';
import axios from 'axios';

const Login33 = () => {


// 	const submitHandler = (e) => {
//        if(username==null || password==null)
// 	   alert("Fill details");
// 		e.preventDefault();
// 		axios.get(`http://localhost:8080/login/${username}/${password}`)
// 		.then(res=>{
// 			if(res.data!=null){
//         alert("successfully logged in");
// 	}
// 	else{
// 		alert("Invalid username");
// 	}
// })
//   }

  const [email, setEmail] = useState('');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [emailError, setEmailError] = useState('');
  const [passwordError, setPasswordError] = useState('');
  const [userError, setUserError] = useState('');
  const navigate = useNavigate();
  const dispatch = useDispatch();

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
    setEmailError('');
  };

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
    setUserError('');
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
    setPasswordError('');
  };



  const handleSubmit = (e) => {
    e.preventDefault();

    if (!username) {
      setUserError('Please enter your name');
      return;
    }

    if (!email) {
      setEmailError('Please enter your email.');
      return;
    }

    const emailRegex = /^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/;
    if (!emailRegex.test(email)) {
      setEmailError('Please enter a valid email address.');
      return;
    }

    if (!password) {
      setPasswordError('Please enter your password.');
      return;
    } else if (password.length < 8) {
      setPasswordError('Password should be at least 8 characters long.');
      return;
    }

    console.log('Login submitted:', email, password);

    navigate('/home');
    alert('You successfully Login');
    dispatch(login({ username,email }));
  };
  


    return (
    <>
   
<div class="wrapper33" >
<div class="inner33">
<div class="image-holder33">
<div class="gwi">
               <video className='videoTag' autoPlay loop muted>
                     <source src={logo} type='video/mp4' />
               </video>
            </div>
</div>
<form action="">
<h3>Login</h3>
<div class="form-wrapper33">
  <label><h6> Username</h6></label>
<input type="text" placeholder="Username" class="form-control" id='username'
                value={username}
                onChange={(e)=>{setUsername(e.target.value)}}/>
                  {userError && <p className="error-message" style={{ color: 'red' }}>{userError}</p>}
 
</div>
<div class="form-wrapper33">
<label><h6>Email</h6></label>
<input type="text" placeholder="Email Address" class="form-control"  id='email'
                value={email}
                onChange={(e)=>{setEmail(e.target.value)}}/>
                 {emailError && <p className="error-message" style={{ color: 'red' }}>{emailError}</p>}

</div>

<div class="form-wrapper33">
<label><h6>Password</h6></label>
<input type="password" placeholder="Password" class="form-control"   id='password'
                value={password}
                onChange={(e)=>{setPassword(e.target.value)}}/>
{passwordError && <p className='error-message' style={{ color: 'red' }}>{passwordError}</p>}
<p class="text-center">Not a member? <a data-toggle="tab" href="/signup">Sign Up</a></p>
</div><button onClick={handleSubmit} style={{marginTop:1}}>Login

</button>

</form>
</div>
</div>

    </>
  );
};

export default Login33;