<template>
 <a-layout-header class="header">
<div class="logo" />
<a-menu
    v-model:selectedKeys="selectedKeys1"
    theme="dark"
    mode="horizontal"
    :style="{ lineHeight: '64px' }"
>
  <a-menu-item key="/">
    <router-link to="/">home</router-link>
  </a-menu-item>
  <a-menu-item key="/admin/ebook">
    <router-link to="/admin/ebook">ebook</router-link>
  </a-menu-item>
  <a-menu-item key="/about">
    <router-link to="/about">about</router-link>
  </a-menu-item>
</a-menu>
</a-layout-header>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-header'
});
</script>
