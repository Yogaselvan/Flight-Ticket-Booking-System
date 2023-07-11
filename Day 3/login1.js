import "../Login/login1.css";

function Login() {
  return (
    <form class="login__form" method="POST" name="frm_login" action="#">
    <header class="login__header">
       <h1 class="login__title">Login</h1>
    </header>
    <main class="login__main">
       <div class="login__group">
          <input class="login__input" type="text" name="input_email" required/>
          <label class="login__label">Email </label>
          <div class="login__bar"></div>
       </div>
       <div class="login__group">
          <input class="login__input" type="password" name="input_password" required/>
          <label class="login__label">Password </label>
          <div class="login__bar"></div>
       </div>
       <p class="login__terms">Create an Account ?<a href="#">SIGN UP</a></p>
    </main>
    <footer class="login__footer">
      <input class="login__button" type="button" name="btn_signin" value="Login"/>
    </footer>
 </form>
  );
}

export default Login;