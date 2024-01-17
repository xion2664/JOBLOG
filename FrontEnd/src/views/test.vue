<template>
    <div class="google-signin-button"
         @click="handleSignInClick">
      Sign in with Google
    </div>
    <div v-if="isSignedIn">
      <p>Welcome, {{ userProfile.name }}</p>
      <!-- Display user info here -->
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted } from 'vue';
  
  const isSignedIn = ref(false);
  const userProfile = ref({});
  
  const handleClientLoad = () => {
    gapi.load('client:auth2', initClient);
  }
  
  const initClient = () => {
    gapi.client.init({
      clientId: '754933257223-vnvdlr8hd50vbfoo6r7644894nc8cdih.apps.googleusercontent.com.apps.googleusercontent.com',
      scope: 'profile email'
    }).then(() => {
      gapi.auth2.getAuthInstance().isSignedIn.listen(updateSigninStatus);
      updateSigninStatus(gapi.auth2.getAuthInstance().isSignedIn.get());
    });
  }
  
  const updateSigninStatus = (isSignedInFlag) => {
    isSignedIn.value = isSignedInFlag;
    if (isSignedInFlag) {
      const profile = gapi.auth2.getAuthInstance().currentUser.get().getBasicProfile();
      userProfile.value = {
        name: profile.getName(),
        email: profile.getEmail(),
        imageUrl: profile.getImageUrl()
      };
    }
  }
  
  const handleSignInClick = () => {
    const GoogleAuth = gapi.auth2.getAuthInstance();
    GoogleAuth.signIn();
  }
  
  onMounted(() => {
    handleClientLoad();
  });
  </script>
  
  <style scoped>
  .google-signin-button {
    /* Style your button */
  }
  </style>
  